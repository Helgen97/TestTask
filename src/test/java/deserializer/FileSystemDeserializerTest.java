package deserializer;

import nodes.DirectoryNode;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class FileSystemDeserializerTest {

    @Test
    public void deserializeFileSystemFile() {
        File inputFile = new File(FileSystemDeserializerTest.class.getClassLoader()
                .getResource("input.txt").getFile());
        String expectedOutput = """
                root|4
                dir_aa|3
                file_tq:54236
                file_aa:35823932
                file_zs:2049
                dir_cd|3
                file_tq:54236
                file_tb:8092
                dir_bb|0
                dir_kb|1
                dir_bs|2
                file_tq:54236
                file_vb:436346
                dir_mn|2
                dir_bb|2
                dir_bb|0
                dir_fj|1
                file_pp:436436
                file_tq:54236
                """;

        DirectoryNode directory = FileSystemDeserializer.deserializeFileSystemFile(inputFile);

        assertEquals(expectedOutput, directory.toString());
    }
}