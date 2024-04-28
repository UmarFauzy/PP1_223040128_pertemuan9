package PpPertemuan9;

public class StrukturQueue {

	 private Node FRONT;
	    private Node REAR;

	    // Konstruktor
	    public StrukturQueue() {
	        FRONT = null;
	        REAR = null;
	    }

	    // Mengembalikan  elemen yang ada di dalam antrian
	    public int size() {
	        int size = 0;
	        Node curNode = FRONT;
	        while (curNode != null) {
	            size++;
	            curNode = curNode.getNext();
	        }
	        return size;
	    }


	    // Mengembalikan yang ditunjuk oleh penunjuk FRONT
	    public int front() {
	        return FRONT != null ? FRONT.getData() : -1;
	    }


	    // Mengembalikan true jika antrian kosong, dan false jika tidak
	    public boolean isEmpty() {
	        return FRONT == null;
	    }

	    // Menambahkan elemen ke dalam antrian
	    public void enqueue(int data) {
	        Node newNode = new Node(data);
	        if (isEmpty()) {
	            FRONT = newNode;
	        } else {
	            REAR.setNext(newNode);
	        }
	        REAR = newNode;
	    }

	    // Menghapus dan mengembalikan elemen terakhir dari antrian
	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Antrian sudah kosong");
	            return -1; // Nilai default jika antrian kosong
	        } else {
	            Node curNode = FRONT;
	            int removedData;
	            if (FRONT == REAR) {
	                removedData = FRONT.getData();
	                FRONT = null;
	                REAR = null;
	            } else {
	                while (curNode.getNext() != REAR) {
	                    curNode = curNode.getNext();
	                }
	                removedData = REAR.getData();
	                REAR = curNode;
	                REAR.setNext(null);
	            }
	            return removedData;
	        }
	    }

	    // Menampilkan elemen yang ada di dalam antrian
	    public void displayElements() {
	        if (isEmpty()) {
	            System.out.println("Elemen Queue: Queue kosong");
	        } else {
	            System.out.print("Elemen Queue: ");
	            Node curNode = FRONT;
	            while (curNode != null) {
	                System.out.print(curNode.getData() + " ");
	                curNode = curNode.getNext();
	            }
	            System.out.println();
	        }
	    }
}
