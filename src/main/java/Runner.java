import db.DBHelper;
import db.DBOwner;
import db.DBFolder;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Owner dan = new Owner("Dan", "Daniel_Aberdeen");
        DBHelper.save(dan);

        Folder images = new Folder("Pictures", dan);
        DBHelper.save(images);

        File file1 = new File("Ooot we ma pals", ".jpeg", 13, images);
        DBHelper.save(file1);

        File file2 = new File("In the pub", ".png", 10, images);
        DBHelper.save(file2);

        File file3 = new File("Oown hoaliday", ".image", 8, images);
        DBHelper.save(file3);

        File file4 = new File("Watchin Engerlan get beat in world cup semi", ".pdf", 20, images);
        DBHelper.save(file4);

        List<File> files = DBHelper.getAll(File.class);

        File foundFile = DBHelper.find(File.class, file1.getId());

        List<File> filesInFolder = DBFolder.getFilesForFolder(images);

        List<Folder> ownersFolders = DBOwner.getFoldersForOwner(dan);

    }

}
