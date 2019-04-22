import java.util.Random;
public class paciente{
    private String sintomas[];
    private String aleatorio[][];
    public paciente(){
        DataSetComponent ds = new DataSetComponent();
        ds.setDataSource("../../../../db/zombie/zombie-health-spreadsheet-ml-training.csv");
        random r = new random();
        this.aleatorio=requestInstances();
        this.sintomas=this.aleatório[(int) 0 + r.nextInt() * 18];
    }
    public String[] Responde(){
        return this.sintomas;
    }
}


public class Medico{
    private String analise[][];
    private String sintomas[];
    public Medico(){
        DataSetComponent ds = new DataSetComponent();
        ds.setDataSource("../../../../db/zombie/zombie-health-spreadsheet-ml-training.csv");
        this.analise=ds.requestInstances();
        this.sintomas=ds.requestAttributes();
    }
    public void Diagnostica(paciente p1){
        boolean k;
        String ss[]=p1.Responde();
        for (int i = 0; i<this.analise.length; i++){
             k=true;
            for (int j = 0; i<this.sintomas.length; j++){
                 if(analise[i][j]!=ss[j])
                     k=false;
            }
            if(k){
                System.out.println("o Paciente possui:"+ analise[i][analise.length-1]);
                break;
            }
        }
    }
}
public static void manin(String[] args){
  Medico m1= new Medico();
  paciente p1 = new paciente();
  m1.Dagnostica(p1);
}



////////////////////////////////////////////////////////////////////////////////////////////////////////
/*public class paciente{
    private String sintomas[];
    private String aleatorio[][];
    public paciente(){
        DataSetComponent ds = new DataSetComponent();
        ds.setDataSource("../../../../db/zombie/zombie-health-spreadsheet-ml-training.csv");
        //System.out.println(( int ) ( 0 + Math.random() * 18 ));
        this.aleatorio=ds.requestInstances();
        this.sintomas=this.aleatorio[( int ) ( 0 + Math.random() * 18 )];
        // System.out.println(this.sintomas[7]+"  "+this.sintomas[0]);
    }
    public String[] Responde(){
        return this.sintomas;
    }
}


public class Medico{
    private String analise[][];
    private String sint[];
    public Medico(){
        DataSetComponent ds = new DataSetComponent();
        ds.setDataSource("../../../../db/zombie/zombie-health-spreadsheet-ml-training.csv");
        this.analise=ds.requestInstances();
        this.sint=ds.requestAttributes();
        System.out.println("here");
    }
    public void Diagnostica (paciente p1){
        System.out.println("here");
        boolean k;
       String ss[]=p1.Responde();
        for (int i = 0; i<this.analise.length; i++){
             k=true;
            for (int j = 0; i<this.sint.length; j++){
                System.out.println("here");
                 if(analise[i][j]!=ss[j])
                     k=false;
            }
            /*if(k){
                System.out.println("o Paciente possui:"+ analise[i][analise.length-1]);
                break;
            }
        }
    }

}
*/
