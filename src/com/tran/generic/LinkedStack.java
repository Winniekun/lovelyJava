package com.tran.generic;

import java.util.LinkedList;

/**
 * @Time: 19-12-13下午7:03
 * @Author: kongwiki
 * @Email: kongwiki@163.com
 */
public class LinkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;

        Node() {
            item = null;
            next = null;
        }

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }


    }

    public Node<T> top = new Node<>();

    public void push(T item) {
        top = new Node<>(item, top);
    }

    public T pop(){
        T result = top.item;
        if(!top.end()){
            top = top.next;
        }

        return result;
    }


    public static void main(String[] args) {
        LinkedStack<String > lss = new LinkedStack<>();
        for(String s: "Parsers on stun!".split(" ")){
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null){
            System.out.println(s);
        }
    }

}
