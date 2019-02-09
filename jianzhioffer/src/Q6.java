import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 从尾到头打印链表，当我们遇到从尾到头的时候，首先应该想到的是stack
 * @author Earl_iu
 */
public class Q6 {
    public static void main(String args[]){
        Stack s = new Stack();
        Node node = new Node(1,null);
        node.add(new Node(2,null));
        Q6_test.run(node);
    }
}

class Q6_test{
    public static void run(Node node){
        Stack s = new Stack();
        s.push(node);
        while(node.next!=null){
            s.push(node.next);
            node = node.next;
        }
        while(!s.isEmpty()){
            Node out = (Node) s.pop();
            System.out.println(out.i);
        }
    }
}

