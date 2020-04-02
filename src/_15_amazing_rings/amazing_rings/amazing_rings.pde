int x1 = 250;
int x2 = 750;
int speed = 1;
    void setup(){
        size(1000,1000);  
        noFill();
    }

    void draw(){
      background(200,200,200);
        int circleSize = 800;

        for(int i=20; i >1; i--){

                circleSize = 15 * i;
        ellipse(x1,500,circleSize,circleSize);
        }
        x1 = x1 + speed;
        if(x1 >= width - 200 || x1<= 200){
          speed=-speed;
        }
        
        for(int i=20; i >1; i--){
                circleSize = 15 * i;
        ellipse(x2,500,circleSize,circleSize);
        }
        x2 = x2 - speed;
        if(x2 >= width - 200 || x2<= 200){
          speed=-speed;
        }
      }
