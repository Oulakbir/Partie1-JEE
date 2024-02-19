package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        // Se connecter à la base de données pour récupérer la température
        double temp= Math.random()*40;
        return temp;
    }
}
