import db.DBHelper;
import db.FolderDB;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Folder images = new Folder("Pictures");
        DBHelper.save(images);

        File file1 = new File("Ooot we ma pals", ".jpeg", 13, images);
        DBHelper.save(file1);

        File file2 = new File("In the pub", ".png", 10, images);
        DBHelper.save(file2);

        File file3 = new File("Oown hoaliday", ".image", 8, images);
        DBHelper.save(file3);

        File file4 = new File("Watchin Engerlan get beat in world cup semi", ".pdf", 20, images);
        DBHelper.save(file4);

        List<File> filesInFolder = FolderDB.getFilesForFolder(images);

    }

}
