/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package expressionparser;

/**
 *
 * @author Mark Elias
 * @param <AnyType>
 */
public interface StackInterface<AnyType> {
    void push(AnyType e);
    AnyType pop();
    AnyType peek();
    boolean isEmpty();
}
