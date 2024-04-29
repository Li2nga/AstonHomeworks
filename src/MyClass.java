public class MyClass {
    private int myFieldOne;
    private int myFieldTwo;
    private int myFieldThree;

    public int getMyFieldOne() {
        return myFieldOne;
    }

    public void setMyFieldOne(int myFieldOne) {
        if (myFieldOne > 0) {
            this.myFieldOne = myFieldOne;
        } else System.out.println("myFieldOne must be >0");
    }

    public int getMyFieldTwo() {
        return myFieldTwo;
    }

    public void setMyFieldTwo(int myFieldTwo) {
        if (myFieldTwo < 0) {
            this.myFieldTwo = myFieldTwo;
        } else System.out.println("myFieldTwo must be <0");
    }

    public int getMyFieldThree() {
        return myFieldThree;
    }

    public void setMyFieldThree(int myFieldThree) {

        {
            if (myFieldThree > -100 && myFieldThree < 2000) {
                this.myFieldThree = myFieldThree;
            } else System.out.println("myFieldThree must be from -99 to 1999");
        }
    }
}


