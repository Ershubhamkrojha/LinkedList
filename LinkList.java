import java. util.*; 

class LinkList {
	public static void main(String[] arg)
	{
        Scanner sc=new Scanner(System.in);
        LinkedList l=new LinkedList();

        System.out.println("Enter size of LinkList:-");
        int n=sc.nextInt();
		while(true){
			
        System.out.println("Enter what you Want?..\n1.inseret elment in link list...\n2nd.insert at position...\n3rd.insert at first position...\n4th.insert at last position...\n5th.Get first...\n6th.Get last...\n7th.Get position...\n8th.remove first...\n9th.Remove last...\n10th.Remove at position...\n11th.delete all Element...\n12th.Display ");
        int ch=sc.nextInt();
        switch (ch) {
            case 1: insertelement(n,l,sc);
			break;
            case 2: insertpos(l,sc);
			break;
            case 3: insertfirstPos(l,sc);
            break;
            case 4:insertlastPos(l,sc);
            break;
            case 5:GetFirst(l);
            break;
            case 6:GetLast(l);
            break;
            case 7:GetPos(l,sc);
            break;
            case 8:RemoveFirst(l);
            break;
            case 9:RemoveLast(l);
            break;
            case 10:RemovePos(l,sc);
            break;
            case 11:RemoveAll(l);
            break;
            case 12:Display(l);
            break;
			case 13:
			default:System.out.println("Enter valid choice");
           
     }
	}
	}
	
	
          public static void insertelement(int n, LinkedList l,Scanner sc)
		  {
		    for(int i=0;i<n;i++)
			  {
				 System.out.println("En{ter Element in LinkList:-");
                 int val=sc.nextInt();
				 l.add(val);
               }
	     	}
		  public static void insertpos(LinkedList l,Scanner sc){
			  System.out.println("Enter position:-");
			  int pos=sc.nextInt();
			  System.out.println("Enter element for add in linklist:-");
			  int val=sc.nextInt();
			  l.add(pos,val);
			}
			public static  void insertfirstPos(LinkedList l,Scanner sc){
				System.out.println("Enter element for add in linklist:-");
			  int val=sc.nextInt();
			  l.addFirst(val);
			}
			public static void insertlastPos(LinkedList l,Scanner sc){
				System.out.print("Enter element for add in linklist:-");
			    int val=sc.nextInt();
			    l.addFirst(val);
			}
			public static void GetFirst(LinkedList l){
				System.out.println(l.getFirst());
			}
			public static  void GetLast(LinkedList l){
				System.out.println(l.getLast());
			}
			public static void GetPos(LinkedList l,Scanner sc){
				System.out.println("Enter Possition in linklist:-");
			    int pos=sc.nextInt();
				System.out.println(l.get(pos));
			}
			public static void RemoveFirst(LinkedList l)
			{
			 l.removeFirst();
			}
			public static void RemoveLast(LinkedList l)
			{
			 l.removeLast();
			}
			public static  void RemovePos(LinkedList l,Scanner sc){
				System.out.println("Enter Position for Remove:-");
				int r=sc.nextInt();
				l.remove(r);
				}
			public static  void RemoveAll(LinkedList l){
			     l.clear();		
				}
			public static void Display(LinkedList l)
			{
				System.out.println(l);
				Iterator I=l.iterator();
				while(I.hasNext()){
					System.out.println(I.next());
				}
	        }        
}