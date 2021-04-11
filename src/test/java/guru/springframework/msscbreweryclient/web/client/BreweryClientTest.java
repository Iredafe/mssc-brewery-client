package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {
        BeerDto beerDto= client.getBeerById(UUID.randomUUID());

        assertNotNull(beerDto);
    }

    @Test
    void  testSaveNewBeer(){
        //given
        BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();
        URI uri = client.saveNewBeer(beerDto);
        assertNotNull(uri);

        System.out.println(uri.toString());
    }

}