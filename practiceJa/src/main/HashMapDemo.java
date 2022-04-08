package main;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;


public class HashMapDemo {

 public static void main(String args[]) {
  Integer[] a=new Integer[]{1,4,3,5,6,3,4,5,7,2,1};

  Arrays.stream(a).collect(Collectors.groupingBy())

 }

}


