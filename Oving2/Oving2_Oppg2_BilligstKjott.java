import static javax.swing.JOptionPane.*;
class Oving2_Oppg2_BilligstKjott{
	public static void main(String[] args){

		double prisMerkeA = 35.9/450;
		double prisMerkeB = 39.5/500;
		if (prisMerkeA>prisMerkeB){
			showMessageDialog(null, "Kjottdeigen fra merke B er billigst." + " Den koster " + prisMerkeB*1000 + " kr per kg");
		}else {
			showMessageDialog(null, "Kjottdeigen fra merke A er billigst");
		}
	}
}