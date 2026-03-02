package INTERPRETER;

// é a expressão terminal que implementa expression 
public class TagExpression implements Expression {

    private String tag;

    public TagExpression(String tag) {
        this.tag = tag;
    }

    // e vai conferir se a tag ta presente na busca.
    @Override
    public boolean interpret(FileData file) {
        return file.getTags().contains(tag);
    }
}
