package activitats;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class knockknockServer {
    public static void main(String[] args) throws IOException {
        int portNumber = 8005;
        try (
                ServerSocket serverSocket = new ServerSocket(portNumber);

        )
        {
            while(true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connexio acceptada");
                ThreadClient client = new ThreadClient(clientSocket);
            }

        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                    + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }


}

