package BusReservation;

public class BusClass {
    private int BusNumber;
    private boolean Ac;
    private int Capacity;

    BusClass(int No,boolean ac,int cap)
    {
        this.BusNumber=No;
        this.Ac=ac;
        this.Capacity=cap;
    }

    public boolean isAc() {
        return Ac;
    }
    public int getBusNumber()
    {
       return BusNumber;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int cap) {
        Capacity = cap;
    }

    public void setAc(boolean value) {
        Ac = value;
    }
    public void displayBusInfo(){
        System.out.println("Bus Number "+BusNumber+ " AC: "+Ac+" Total Capacity: "+Capacity);
    }

}

