
    void setup(){
        size(1000,1000);  

    }

    void draw(){
        int circleSize = 800;
        int ring_count = 0;
        for(int i=7; i < 8; i--){
          ring_count = ring_count+1;
          if (ring_count % 2 == 0) {
          circleSize = circleSize - 50;
          fill(#FF0303);
          ellipse(400,400,circleSize, circleSize);
        }
        else{
          circleSize = circleSize - 50;
          fill(#030000);
          ellipse(400,400,circleSize,circleSize);
    }
        }
      }
