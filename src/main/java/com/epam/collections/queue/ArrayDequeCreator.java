package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> cardDeck = new ArrayDeque<>();
        cardDeck.addFirst(firstQueue.remove());
        cardDeck.addFirst(firstQueue.remove());
        cardDeck.addFirst(secondQueue.remove());
        cardDeck.addFirst(secondQueue.remove());
        while (!(firstQueue.isEmpty() && secondQueue.isEmpty())) {
            firstQueue.add(cardDeck.removeFirst());
            cardDeck.addFirst(firstQueue.remove());
            cardDeck.addFirst(firstQueue.remove());
            secondQueue.add(cardDeck.removeFirst());
            cardDeck.addFirst(secondQueue.remove());
            cardDeck.addFirst(secondQueue.remove());
        }
        return cardDeck;
    }

//    public static void main(String[] args) {
//        ArrayDequeCreator test = new ArrayDequeCreator();
//        Queue<Integer> firstQueue = new LinkedList<>(Arrays.asList(1, 5, 7, 6));
//        Queue<Integer> secondQueue = new LinkedList<>(Arrays.asList(2, 5, 8, 3));
//        System.out.println(firstQueue);
//        System.out.println(secondQueue);
//        System.out.println(test.createArrayDeque(firstQueue, secondQueue));
//    }
}
