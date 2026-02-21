import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PostManager {
    private final static ObjectMapper mapper = new ObjectMapper();
    public static String serialize(Post post) {
        mapper.configure(SerializationFeature.INDENT_OUTPUT,true);
        try{
            String json = mapper.writeValueAsString(post);
            return json;
        }catch (JsonProcessingException exception){
            throw new RuntimeException(exception);
        }
    }


    public static List<String> serialize(List<Post> posts) {
        List<String> jsons = new ArrayList<>();
            for(Post post : posts) {


                ObjectMapper mapper = new ObjectMapper();
                mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
                try {
                    String json = mapper.writeValueAsString(post);
                    jsons.add(json);
                } catch (JsonProcessingException exception) {
                    throw new RuntimeException(exception);
                }

            }
            return jsons;
    }

    public static Path writeJsonObjectToFile(String json){
        String path = "/home/fathia-oyinloye/Documents/git-repositories/postManagerApp/files";
        String fileName = "post.json";
        Path newPath = Path.of(path, fileName);
        try{
            Files.writeString(newPath,json);
        }catch (IOException exception){
            exception.printStackTrace();
        }
        return newPath;
    }


    public static Post deserialize(String json) {
        try {
         Post post =  mapper.readValue(json, Post.class);
         return post;
        }catch (JsonProcessingException exception){
            exception.printStackTrace();
        }
      return null;
    }
}

