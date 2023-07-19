class Queue<T> {
    private a: T[];
    private maxSize: number=-1;

 

    constructor(a:T[]) {
        this.a = a;
    }

 

     public isFull(): boolean {
        return this.maxSize==9;
    }
    public enqueue(element: T): void {
        if (!this.isFull()) 
            this.a[++this.maxSize] = element;
        else
             console.log("Queue Overflow");

 

    }

 

      public isEmpty(): boolean {
        return this.maxSize == -1;
    }

 


    public dequeue(): void {
        if (!this.isEmpty()) 
            console.log(this.a[this.maxSize--]);
        else
            console.log("Queue is Underflow");
        }

 

  

}


var queue = new Queue<number>(new Array(10));

 

for (var i = 1; i <= 11; i++)
    queue.enqueue(i * 10);

 

for (var i = 1; i <= 10; i++)
    queue.dequeue();
