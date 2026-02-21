import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class PostManagerTest {

    @Test
    void testCanSerializePost(){
        Post post = new Post();
        post.setId(1);
        post.setPostId(1000);
        post.setEmail("fathiaoyinloye20@gmail.com");
        post.setBody("This is my first post");
        post.setAuthor("Chimamanda");

        String json = PostManager.serialize(post);
        assertNotNull(json);
        String expected = """
                {
                  "id" : 1,
                  "body" : "This is my first post",
                  "email" : "fathiaoyinloye20@gmail.com",
                  "author" : "Chimamanda",
                  "post_id" : 1000
                }""";
        assertEquals(expected,json);


    }
    @Test
    void testThatYouCanWriteJSonToFile(){
        Post post = new Post();
        post.setId(1);
        post.setPostId(1000);
        post.setEmail("fathiaoyinloye20@gmail.com");
        post.setBody("This is my first post");
        post.setAuthor("Chimamanda");

        String json = PostManager.serialize(post);
        assertNotNull(json);
        PostManager.writeJsonObjectToFile(json);


    }

    @Test
    void testThatYouCanSerialiazeAListOfPostObject(){
        ArrayList<Post> posts = new ArrayList<>();
        for(int count = 1; count <= 5; count++ ) {
            Post post = new Post();
            post.setId(count);
            post.setPostId(1000);
            post.setEmail("fathiaoyinloye20@gmail.com");
            post.setBody("This is my first post");
            post.setAuthor("Chimamanda");
            posts.add(post);
        }

        List<String> jsons = PostManager.serialize(posts);
        assertNotNull(jsons);
        assertEquals(5, jsons.size());

    }

    private static String generateJson(){
        String json = """
                {
                  "id" : 1,
                  "body" : "This is my first post",
                  "email" : "fathiaoyinloye20@gmail.com",
                  "author" : "Chimamanda",
                  "post_id" : 1000
                }""";

        return json;
    }

    @Test
    void testCanDeseralizePost(){
        String json = generateJson();

        Post post = PostManager.deserialize(json);
        assertNotNull(post);
        assertEquals(1000, post.getPostId());
        assertEquals("Chimamanda", post.getAuthor());
        assertEquals(1, post.getId());

    }


    @Test
    void testCanSerializeWithDate(){
        Post post = new Post();
        post.setId(1);
        post.setPostId(1000);
        post.setEmail("fathiaoyinloye20@gmail.com");
        post.setBody("This is my first post");
        post.setAuthor("Chimamanda");
        post.setDate(LocalDateTime.now());

        String json = PostManager.serialize(post);
        assertNotNull(json);

    }


}