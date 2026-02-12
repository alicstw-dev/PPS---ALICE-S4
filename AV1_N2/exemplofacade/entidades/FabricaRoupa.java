
public class FabricaRoupa {
    public static RoupaEspacial escolher(CorpoCeleste destino) {
        if (destino instanceof Planeta) {
            return new RoupaParaPlaneta();
        } else {
            return new RoupaParaLua();
        }
    }
}
