class Solution {
    
    public Node mergeKLists(Node[] lists) {
        
        int minimumValue = (int)(1e9);

        int index = -1;

        for(int i = 0; i < lists.length; i++){
            if(lists[i] != null && lists[i].data < minimumValue){
                minimumValue = lists[i].data;
                index = i;
            }
        }

        if(index == -1){
            return null;
        }

        Node startingNode = lists[index];

        lists[index] = lists[index].bottom;
        startingNode.bottom = mergeKLists(lists);

        return startingNode;

    }
    
    
    Node flatten(Node root) {
        
        Node temp = root;
        int count = 0;
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        Node lists[] = new Node[count];
        
        temp = root;
        int index = 0;
        
        while(temp != null){
            
            Node nxt = temp.next;
            temp.next = null;
            lists[index] = temp;
            temp = nxt;
            
            index++;
        }
        
        Node answer = mergeKLists(lists);
        
        return answer;
        
    }
}
