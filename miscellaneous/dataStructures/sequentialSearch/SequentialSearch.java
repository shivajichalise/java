class SequentialSearch{
  public static Boolean search(Integer[] list, int item){
    int totalItemsInList = list.length;
    for(int i=0; i<totalItemsInList; i++){
      if(list[i] == item){
        return true;
      }
    }
    return false; 
  }

  public static void main(String[] args){
    Integer[] list = {2,3,6,9,1,5};
    int item = 9;
    Boolean itemExists = search(list, item);
    if(itemExists){
      System.out.println("Item "+item+" is in the list.");
    }else{
      System.out.println("Item "+item+" is not in the list.");
    }
  }
}
