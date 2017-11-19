
package Mini_projet;



/**
 *
 * @author HP
 */
public class Personnel {
    
private final Employe []collectionemploye;

private int nbreemploye;

private final static int nbremaximalemploye=1342;

public Personnel(){
    
    collectionemploye=new Employe[nbremaximalemploye];
    
    nbreemploye=0;
    
}
public void ajouteremploye(Employe m){
    
    ++nbreemploye;
    
    if(nbreemploye<=nbremaximalemploye){
        
    collectionemploye[nbreemploye-1]=m;
}
    else{
    System.out.println("pas plus de "+nbremaximalemploye+" employe");
        
}
}
public double salairemoyen(){
    
    double somme=0.0;
    
    for(int i=0;i<nbreemploye;i++){
        
    somme+=collectionemploye[i].calculerSalaire();
}
    return somme/nbreemploye;
}
public void affichersalaire(){
    for(int i=0;i<nbreemploye;i++){
        
    System.out.println(collectionemploye[i].getNom()+" gagne "+collectionemploye[i].calculerSalaire());
}
}
 
    
    
}
