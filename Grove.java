import java.util.ArrayList;

public class Grove{
    public ArrayList<Tree> trees;
    public String grovename;

    public Grove(String grovename){
        this.grovename = grovename;
        this.trees = new ArrayList<>(12);
    }

    public int plant(Tree tree){
        if (trees.size() < 12){
            trees.add(tree);
            return trees.size() - 1;
        }
        return -1;
    }

    public Tree remove(int index){
        if (index >= 0 && index < trees.size()){
            return trees.remove(index);
        }
        return null;
    }

    @Override
    public String toString(){
        return String.valueOf(trees.size());
    }
}