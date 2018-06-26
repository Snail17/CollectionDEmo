package com.hong.collectiondemo.instroctor;

/**
 * Created by Administrator on 2018/6/26.
 */
public class Link {

    public static Node linkIsCircle() {
        Node node = null;
S
        return node;
    }


    public class Node<E> {
        E e;
        Node<E> next;
        Node<E> pre;

        public Node(E e, Node<E> next, Node<E> pre) {
            this.e = e;
            this.next = next;
            this.pre = pre;
        }

        public E getE() {
            return e;
        }

        public void setE(E e) {
            this.e = e;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPre() {
            return pre;
        }

        public void setPre(Node<E> pre) {
            this.pre = pre;
        }
    }
}
