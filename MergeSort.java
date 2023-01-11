public class MergeSort {
    public static Queue merge(Queue a, Queue b) { //conquer

        Queue result = new Queue();

        while (a.isEmpty() != true && b.isEmpty() != true) {

            if (b.getFirst() < a.getFirst())
                result.enqueue(b.dequeue());
            else
                result.enqueue(a.dequeue());
        }
        while (a.isEmpty() != true)
            result.enqueue(a.dequeue());

        while (b.isEmpty() != true)
            result.enqueue(b.dequeue());

        return result;
    }

    public static Queue mergeSort(Queue input) { //divide

        if (input.size() == 1) {

            Queue result = new Queue();
            result.enqueue(input.dequeue());
            return result;
        } 
		else {
            int halfSize = input.size() / 2;
            Queue firstHalf = new Queue();
            for (int i = 0; i < halfSize; i++)
                firstHalf.enqueue(input.dequeue());
            Queue secondHalf = input;
            return merge(mergeSort(firstHalf), mergeSort(secondHalf));
        }
    }
    
    public static void main(String[] args) {

		Queue que = new Queue();
        int B = 0;
        Node A = new Node(B);

        que.enqueue(25);
        que.enqueue(10);
        que.enqueue(15);
        que.enqueue(5);
        que.enqueue(7);
        que.show(A);

        que.size();

        Queue result = mergeSort(que);

        result.show(A);
		Queue que2 = new Queue();
		Node G = new Node(0);
		que2.enqueue(10);
        que2.enqueue(9);
        que2.enqueue(8);
        que2.enqueue(7);
        que2.enqueue(6);
        que2.enqueue(5);
        que2.enqueue(4);	
        que2.enqueue(3);	
        que2.enqueue(2);	
        que2.enqueue(1);	
		que2.show(G);
		que2.size();

		Queue r = mergeSort(que2);
		r.show(G);

		
	}
}
