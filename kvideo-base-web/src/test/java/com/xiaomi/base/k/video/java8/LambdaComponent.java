package com.xiaomi.base.k.video.java8;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author jianglianglong
 * @date: 2020/8/4 11:13
 */
public class LambdaComponent {

    /**
     * 集合迭代
     */
    @Test
    public void testForEach() {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");

        features.forEach(System.out::println);
    }

    /**
     * filter过滤
     */
    @Test
    public void testFilter() {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        languages.stream().filter(name -> name.contains("l")).forEach(System.out::println);

        //多个过滤器执行
        languages.stream().filter(name -> name.contains("l")).filter(name -> name.length() > 5).forEach(name -> System.out.println("两个过滤之后" + name));

        //通过方法进行过滤，返回值为Boolean
        languages.stream().filter(this::filter).forEach(System.err::println);

        Predicate<String> startWith = n -> n.contains("l");
        Predicate<String> length = n -> n.length() == 5;
        languages.stream().filter(startWith.and(length)).forEach(System.out::println);

    }

    /**
     * 自定义方法过滤
     *
     * @param name
     * @return
     */
    private boolean filter(String name) {
        return name.contains("l");
    }

    /**
     * 集合操作--map
     */
    @Test
    public void testMap() {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (Integer cost : costBeforeTax) {
            double v1 = .12;
            double v = cost + v1 * cost;
        }
        System.out.println(.01);

        costBeforeTax.stream().map(cost -> cost + .12 * cost).forEach(System.out::println);
    }

    /**
     * 集合操作---汇总reduce
     */
    @Test
    public void testMapAndReduce() {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);

        Double total = costBeforeTax.stream().map(cost -> cost + .12 * cost).reduce(Double::sum).get();
        System.out.println("总和为===" + total);

        // 找出最长的单词
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        Optional<String> longest = stream.reduce((s1, s2) -> s1.length() >= s2.length() ? s1 : s2);
        //Optional<String> longest = stream.max((s1, s2) -> s1.length()-s2.length());
        System.err.println(longest.get());
    }

    /**
     * 返回一个集合
     * distinct去重
     */
    @Test
    public void testCollect() {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        List<String> lanList = languages.stream().filter(lan -> lan.length() > 4).collect(Collectors.toList());
        //大写用，号隔开
        String jsonString = languages.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        lanList.forEach(System.out::println);
        System.err.println(jsonString);

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        //distinct去重
//        numbers.stream().distinct().forEach(System.out::println);
        Map<Integer, Integer> collect = numbers.stream().distinct().collect(Collectors.toMap(n -> n + 1, n -> n));
        collect.forEach((k, v) -> System.out.println(k + "---" + v));
    }

    /**
     * 计算集合元素的最大值、最小值、总和以及平均值
     */
    @Test
    public void testNumber() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics statistics = primes.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.err.println(statistics.getCount());
        System.out.println("Highest prime number in List : " + statistics.getMax());
        System.out.println("Lowest prime number in List : " + statistics.getMin());
        System.out.println("Sum of all prime numbers : " + statistics.getSum());
        System.out.println("Average of all prime numbers : " + statistics.getAverage());

    }

    /**
     * map对应的方法，新方法
     */
    @Test
    public void testMapForEach() {

        Map<Integer, String> numberMap = new HashMap<>();
        numberMap.put(1, "one");
        numberMap.put(2, "two");
        numberMap.put(3, "three");

        //key - value 遍历
        numberMap.forEach((k, v) -> System.out.println(k + "=" + v));

        //查询key对应的value
        System.err.println(numberMap.getOrDefault(3, "noValue"));
        //不存在key值的映射或映射值为null时，才将value指定的值放入到Map中，否则不对Map做更改
        numberMap.putIfAbsent(3, "3");
        numberMap.putIfAbsent(4, "four");
        numberMap.forEach((k, v) -> System.out.println(k + "=" + v));

    }

    /**
     * 生成map
     */
    @Test
    public void testToMap() {
        List<Student> studentList = genStudentList();

        //toMap
        Map<String, Student> studentMap = studentList.stream().collect(Collectors.toMap(Student::getName, student -> student));
        studentMap.forEach((k, v) -> System.out.println(k + "----" + v));

        //partitioningBy依据某个二值逻辑（满足条件，或不满足）分成互补相交的两部分，比如男女性别、成绩及格与否等
        //false----[Student(name=小黄, age=23, grade=49), Student(name=小绿, age=22, grade=50)]
        //true----[Student(name=小明, age=25, grade=90), Student(name=小红, age=24, grade=89), Student(name=小兰, age=21, grade=60)]
        Map<Boolean, List<Student>> booleanListMap = studentList.stream().collect(Collectors.partitioningBy(student -> student.getGrade() >= 60));
        booleanListMap.forEach((k, v) -> System.out.println(k + "----" + v));

        List<Student> students = booleanListMap.get(true);
        students.forEach(System.out::println);

        //女==[Student(name=小红, sex=女, age=24, grade=89), Student(name=小兰, sex=女, age=22, grade=60)]
        //男==[Student(name=小明, sex=男, age=25, grade=90), Student(name=小黄, sex=男, age=23, grade=49), Student(name=小绿, sex=男, age=22, grade=50)]
        studentList.stream().collect(Collectors.groupingBy(Student::getSex)).forEach((k, v) -> System.err.println(k + "==" + v));
        studentList.stream().collect(Collectors.groupingBy(Student::getAge)).forEach((k, v) -> System.err.println(k + "==" + v));

    }

    /**
     * 多条流合并
     */
    @Test
    public void testFlatMap() {
        List<String> map1 = Lists.newArrayList("1", "2");
        List<String> map2 = Lists.newArrayList("3", "4");
        List<List<String>> mapList = Arrays.asList(map1, map2);

        List<String> collect = mapList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
    }

    /**
     * anyMatch
     */

    /**
     * 生成student集合
     *
     * @return
     */
    private List<Student> genStudentList() {

        Student student2 = new Student("小红", "女","24", 89);
        Student student1 = new Student("小明", "男","25", 90);
        Student student3 = new Student("小黄", "男","23", 49);
        Student student4 = new Student("小绿", "男","22", 50);
        Student student5 = new Student("小兰", "女","22", 60);


        List<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        return students;

    }

}
