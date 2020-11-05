import static javax.swing.JOptionPane.*;

class Oving2_Oppg1_kuddar{
    public static void main(String[] args){
        String arstallLest = showInputDialog("arstall: ");
        int arstall = Integer.parseInt(arstallLest);

        if (arstall%400==0){
            showMessageDialog(null, "arstallet er et skuddar");
        } else if (arstall%100!=0 && arstall%4==0){
            showMessageDialog(null, "arstallet er et skuddar");
        }else{
            showMessageDialog(null, "arstallet er ikke et skuddar");
        }
    }
}