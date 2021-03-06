package com.company.masiu.dataStructures;

import java.util.ArrayList;

public interface Stackable {

  int peek();

  boolean isEmpty();

  ArrayList<Integer> push(int value);

  ArrayList<Integer> pop();

  void showItems();
}
