class calvolume{
    public int volume(int length){
        return length*length*length;
    }
    public double volume(double radius){
        return (4/3)*(22/7)*radius*radius*radius;
    }
    public double volume(double radius,double height){
        return (22/7)*radius*radius*height;
    }
}
class methodoverloading{
    public static void main(String[] args){
        calvolume vol = new calvolume();
        System.out.println(vol.volume(4));
        System.out.println(vol.volume(7.0));
        System.out.println(vol.volume(4.0,5.0));
    }
}