/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expressionparser;

import java.util.ArrayList;

/**
 *
 * @author Mark Elias
 * @param <E>
 */

public class GenericStack<E> implements StackInterface<E> {
    private ArrayList<E> list = new ArrayList<>();

    @Override
    public void push(E o) {
        list.add(o);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.get(getSize() - 1);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}


