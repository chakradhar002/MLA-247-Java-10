package jstldemo;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/async-demo", asyncSupported = true)
public class AsyncServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Start asynchronous processing
        AsyncContext asyncContext = request.startAsync();

        // Run a long-running task in a separate thread
        CompletableFuture.runAsync(() -> {
            try {
                // Simulate long-running operation
                Thread.sleep(5000);

                // Write the response
                HttpServletResponse asyncResponse = (HttpServletResponse) asyncContext.getResponse();
                asyncResponse.setContentType("text/plain");
                asyncResponse.getWriter().write("Task completed asynchronously!");

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Complete the asynchronous operation
                asyncContext.complete();
            }
        });
    }
}
