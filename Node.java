public class Node {
   
   // a pointer to a CharData object
   CharData cp;
  
   // a pointer to a Node object
   Node next;  // pointer

   public CharData cd;

  
  
   /** Constructs a node with the given CharData object.
    *  The new node will point to the given next node. */
   public Node(CharData cp, Node next) {
      this.cp = cp;
      this.next = next;
   }
        
   /** Constructs a node with the given CharData object.
    *  The new node will point to null. */
   public Node(CharData cp) {
      this(cp, null);
   }

   private Node (){

   }

   public Node getFirst(){
     return this;
   }

   public String toString() {
      return "" + cp;
   }
}