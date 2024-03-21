import java.util.Scanner; 

class MST{ 
int minKey(int key[], Boolean mstSet[],int V)
{
int min = Integer.MAX_VALUE, min_index=-1;
for (int v = 0; v < V; v++)
if (mstSet[v] == false && key[v] < min)
{
 min = key[v]; 
 min_index = v;
}
return min_index;
}
void printMST(int parent[], int V, int graph[][]){
System.out.println("Edge Weight"); 
for (int i = 1; i < V; i++)
System.out.println(parent[i]+" - "+ i+" "+graph[i][parent[i]]);
}
void primMST(int graph[][],int V){
int parent[] = new int[V];
int key[] = new int [V];
Boolean mstSet[] = new Boolean[V];
for (int i = 0; i < V; i++){
key[i] = Integer.MAX_VALUE; 
mstSet[i] = false;
}
key[0] = 0; 
parent[0] = -1;
for (int count = 0; count < V-1; count++){ 
int u = minKey(key, mstSet,V);
mstSet[u] = true;
for (int v = 0; v < V; v++)
if (graph[u][v]!=0 && mstSet[v] == false &&graph[u][v] < key[v]){
parent[v] = u;
key[v] = graph[u][v];
}
}
printMST(parent, V, graph);
}
public static void main (String[] args){
MST t = new MST();
//int graph[][] = new int[][] {{0, 2, 0, 6, 0},
//{2, 0, 3, 8, 5},
//{0, 3, 0, 0, 7},
//{6, 8, 0, 0, 9}, 
//{0, 5, 7, 9, 0}};
Scanner s=new Scanner(System.in);
System.out.println("Enter the Graph Size:");
int n=s.nextInt();
int graph[][] = new int[n][n];
System.out.println("Enter the value of vertices:");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
graph[i][j]=s.nextInt();
}
}
t.primMST(graph,n);
s.close();
}
}
