/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Earl_iu
 */
public class Node {
    int i;
    Node next;
    Node(int i, Node next){
        this.next = next;
        this.i = i;
    }
    
    public void add(Node node){
        this.next = node;
    }
}
