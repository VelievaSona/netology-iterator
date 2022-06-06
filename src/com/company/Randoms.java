package com.company;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator(min, max);
    }

    public class RandomsIterator implements Iterator<Integer> {
        protected Random random;

        protected int min;
        protected int max;

        public RandomsIterator(int min, int max) {
            random = new Random();

            this.min = min;
            this.max = max;
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(min, max + 1);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
