package aula4;


public enum Status {
    ON(true), OFF(false);

     private boolean statusCorrespondente;

    Status(boolean statusCorrespondente){
        this.statusCorrespondente = statusCorrespondente;
    }

     public boolean isOn(){
        return statusCorrespondente;
     }
}

