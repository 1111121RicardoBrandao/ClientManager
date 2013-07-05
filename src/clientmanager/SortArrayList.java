/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmanager;

import java.util.Comparator;

/**
 *
 * @author Scare
 */
public class SortArrayList implements Comparator{

    /**
     *
     * @param o1
     * @param o2
     * @return negative int, zero or positive int, as the first argument
     * o1 is less, equal or greater than the second o2
     */
    @Override
    public int compare(Object o1, Object o2) {
        Client c1 = (Client) o1;
        Client c2 = (Client) o2;
        return (c1.getName().compareTo(c2.getName()));
    }
}
