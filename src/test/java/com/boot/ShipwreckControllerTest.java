package com.boot;


import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.when;

public class ShipwreckControllerTest {
    @InjectMocks
    private ShipwreckController shipwreckController;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShipwreckGet(){
        Shipwreck mockedShipwreck = new Shipwreck();
        mockedShipwreck.setId(1L);

        when(shipwreckRepository.findOne(1L)).thenReturn(mockedShipwreck);

        // Call the controller method
        Shipwreck shipwreck = shipwreckController.get(1L);
        //assertEquals(shipwreck.getId(), mockedShipwreck.getId());

        // Assert using Hamcrest
        assertThat(shipwreck.getId(), is(mockedShipwreck.getId()));

    }


}
