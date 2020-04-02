
    void setup(){
        size(1000,1000);  

    }

    void draw(){
        int circleSize = 800;
        int ring_count = 0;
        for(int i=7; i >1; i--){
          ring_count = ring_count+1;
          if (ring_count % 2 == 0) {
          fill(#FF0303);
        }
        else{
          fill(#030000);
    }
        circleSize = 100 * i;
        ellipse(400,400,circleSize,circleSize);
        }
      }
