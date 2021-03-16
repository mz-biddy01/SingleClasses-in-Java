public class WaterBottle {

    private int volume;



    public WaterBottle(int volume){
          this.volume = volume;


    }
    public int getVolume() {
        return volume;
    }
    public boolean startsWith100(){
        if(this.volume == 100) {
            return true;
        }
        return false;
        }

    public void drink(){
        int newVolume = this.volume - 10;
        this.volume = newVolume;
    }

    public void empty(){
        this.volume = 0;

    }

    public void fill(){
        this.volume = 100;
    }


}
