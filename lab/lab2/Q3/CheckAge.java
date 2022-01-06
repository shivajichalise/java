class AgeNotEnoughException extends Exception {
  AgeNotEnoughException(String error){
    super(error);
  }
}

class CheckAge {
  public static void main(String[] args) throws AgeNotEnoughException {
    int age = 5;
    if(age < 18){
      throw new AgeNotEnoughException("Age not valid for voting.");
    }
  }
}
