package chellenges;

import java.util.stream.Collectors;

public class MoveStoreMain {
    public static void main(String[] args){
        MoveStore moveStore = new MoveStore ();
        System.out.println (moveStore.getMovies ());

        System.out.println (moveStore.getMovies ().entrySet ().stream ()
                .flatMap (entry->entry.getValue ().stream())
                .collect(Collectors.joining("!")));
    }
}
