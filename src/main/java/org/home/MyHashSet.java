package org.home;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashSet {

        private LinkedList<Integer>[] set = new LinkedList[1000];

        public MyHashSet() {

        }

        public void add(int key) {
            LinkedList<Integer> bucket = set[hash(key)];
            if (bucket == null) {
                bucket = new LinkedList<>();
                set[hash(key)] = bucket;
            }

            for (Integer i : bucket) {
                if (i.equals(key)) {
                    return;
                }
            }

            bucket.add(key);
        }

        public void remove(int key) {
            Integer[] tab;
            String s = "";

        }

        public boolean contains(int key) {
            LinkedList<Integer> bucket = set[hash(key)];
            if (bucket == null) {
                return false;
            }

            for (Integer i : bucket) {
                if (i.equals(key)) {
                    return true;
                }
            }
            return false;
        }

        private int hash(int key) {
            return key % 1000;
        }
    }
