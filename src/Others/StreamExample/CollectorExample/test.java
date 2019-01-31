package Others.StreamExample.CollectorExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

//https://www.baeldung.com/java-8-collectors
public class test {

    public static void main(String[] args) {
        List<String> cypto = new ArrayList<>();
        cypto.add("btc");
        cypto.add("xrp");
        cypto.add("eth");
        cypto.add("eos");
        cypto.add("bch");
        cypto.add("ltc");
        cypto.add("ada");
        cypto.add("ada");//add ada twice
        System.out.println(cypto);//[btc, xrp, eth, eos, bch, ltc, ada, ada]

        //toList
        System.out.println("==============to List===================");
        List<String> result = cypto.stream().collect(toList());
        System.out.println(result);//[btc, xrp, eth, eos, bch, ltc, ada, ada]

        //toSet
        System.out.println("==============to Set===================");
        Set<String> resultSet = cypto.stream().collect(toSet());
        System.out.println(resultSet);//[btc, bch, xrp, eth, eos, ltc, ada]

        //toCollection
        System.out.println("==============to Collection===================");
        List<String> resultList = cypto.stream().collect(toCollection(LinkedList::new));
        System.out.println(resultList);//[btc, xrp, eth, eos, bch, ltc, ada, ada]

        //toMap
        System.out.println("==============to Map===================");
        cypto.remove(7);//remove one ada
        Map<String, String> resultMap1 = cypto.stream().collect(toMap(Function.identity(), String::toString));//Function.identity() is just a shortcut for defining function that accepts and return the same value;
        System.out.println(resultMap1);//{btc=btc, bch=bch, xrp=xrp, eos=eos, eth=eth, ltc=ltc, ada=ada}


        cypto.add("ada");//add ada back
        System.out.println("current list is : " + cypto);
        Map<String, String> resultMap2 = cypto.stream().collect(toMap(key -> key.substring(0, 1), String::toString, (i1, i2) -> i1 + "|" + i2));//deal with duplicated key
        System.out.println(resultMap2); //{a=ada|ada, b=btc|bch, e=eth|eos, x=xrp, l=ltc}

        //Collectors.collectingAndThen()
        System.out.println("==============collectingAndThen===================");
        List<String> valueLength = new ArrayList<>();
        cypto.stream().collect(collectingAndThen(toMap(key -> key.substring(0, 1), String::toString, (i1, i2) -> i1 + "|" + i2),
                                                 map -> valueLength.addAll(map.values())));
        System.out.println(valueLength);//[ada|ada, btc|bch, eth|eos, xrp, ltc]

        //Collectors.joining()
        System.out.println("==============joining===================");
        String joining1 = cypto.stream().collect(joining());
        String joining2 = cypto.stream().collect(joining("--"));
        System.out.println("joining1 :" + joining1);//joining1 :btcxrpetheosbchltcadaada
        System.out.println("joining2 :" + joining2);//joining2 :btc--xrp--eth--eos--bch--ltc--ada--ada

        String joining3 = cypto.stream().collect(joining(" - ", "Start-", "-End"));
        System.out.println("joining3 :" + joining3);//joining3 :Start-btc - xrp - eth - eos - bch - ltc - ada - ada-End

        //counting()
        System.out.println("==============counting===================");
        Long size = cypto.stream().collect(counting());
        System.out.println(size);//8

        //summarizingDouble/Long/Int()
        System.out.println("==============summarizingDouble/Long/Int()===================");
        DoubleSummaryStatistics resultSummary = cypto.stream().collect(summarizingDouble(String::length));
        System.out.println(resultSummary.getAverage());//3.0


        //skipping averagingDouble/Long/Int() and Collectors.summingDouble/Long/Int()

        //maxBy()/minBy()
        System.out.println("==============maxBy()/minBy()===================");
        Optional<String> resultMax = cypto.stream().collect(maxBy(Comparator.naturalOrder()));
        System.out.println(resultMax.get());//xrp

        //groupby
        System.out.println("==============groupingBy()===================");
        Map<Character, Set<String>> resultGroupBy = cypto.stream().collect(groupingBy(i -> i.charAt(0), toSet()));
        System.out.println(resultGroupBy);//{a=[ada], b=[btc, bch], e=[eth, eos], x=[xrp], l=[ltc]}

        //partitioningBy()
        System.out.println("==============partitioningBy()===================");
        Map<Boolean, List<String>> resultPartitioningBy = cypto.stream().collect(partitioningBy(s -> s.charAt(0)== 'b'));
        System.out.println(resultPartitioningBy);//{false=[xrp, eth, eos, ltc, ada, ada], true=[btc, bch]}


        //CustomCollector
        System.out.println("==============CustomCollector===================");
        Stream<Integer> boxes = Stream.of(
                1,5,3,7,32,676,3,87,14,51,34,96
        );

        CustomCollector.MinMax<Integer> minMax = boxes.collect(new CustomCollector<>(Comparator.naturalOrder()));

        System.out.println(minMax.getMax().get());
        System.out.println(minMax.getMin().get());


        //CustomCollector2
        System.out.println("==============CustomCollector2===================");
        CustomCollection2<String> instants = new CustomCollection2<>();
        List<String> collect11 = cypto.stream().collect(Collector.of(instants.supplier(),instants.accumulator(),instants.combiner()));
        System.out.println(collect11);


        List<String> aa = new ArrayList<>();
        aa.add("ewq");
        aa.add("wdv");
        aa.add("bgt");
        aa.add("eds");
        aa.add("brf");
        aa.add("ltc");
        aa.add("rfb");
        aa.add("bii");
        List<String> collect22 = aa.stream().collect(CustomCollection2.getInstance());
        System.out.println(collect22);
    }
}
