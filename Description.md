#### In this project you are going to simulate projectile motion.

#### We have a Game Scene, with a ball, a target and several obstacles. Our aim is to find the velocity for a given angle (shown as α), which we can hit the target with our ball without hitting any of the obstacles. Game scene is illustrated below:
<img width="395" alt="gamescenedrawing" src="https://user-images.githubusercontent.com/124915257/221995075-259e48dc-5805-47ee-8980-b6585f80cbe8.PNG">
#### You are required to complete the following classes:

### Ball:
#### Ball object will represent the orange ball in the game scene. We will calculate the appropriate velocity that will make the ball hit the target (blue ball). Complete the ball class using the following UML diagram. You can add extra datafields according to your solution.
<img width="616" alt="ball" src="https://user-images.githubusercontent.com/124915257/221995202-1042a91f-e49e-4150-aad5-7b15096507f4.PNG">
### Obstacle: 
#### Obstacles are rectangular obstacles that were represented with red boxes in the game scene. While we are calculating the appropriate velocity for a given α, we need to make sure our ball do not hit these obstacles. Obstacle objects will be represented in the game scene in an array list, and will be given in different locations on different test cases. Complete the obstacle class using the following UML diagram. You can add extra data fields according to your solution.
<img width="727" alt="obstacle" src="https://user-images.githubusercontent.com/124915257/221995260-f08c9c03-ed69-446f-9962-80cc0c003608.PNG">
### GameScene: 
#### Game scene will represent the whole scene, with the ball, the obstacles and location of the target. Complete this class according to the given UML diagram. findVelocity method will be used in test cases:
#### α will be given to this method as a parameter.
#### You will calculate the appropriate velocity for the given α, where the ball can hit the target. Velocity cannot be greater than the max velocity given in the class.
#### Ball always will be thrown from (0,0)
#### Obstacles and target will be on the ground, there will not be any flying obstacles or target.
#### Obstacle and target information will be available on game scene (As a datafield, see UML diagram)
#### findVelocity method should return "-1.0" if there is no solution. This can happen with impossible settings of obstacles.

<img width="510" alt="gamescene" src="https://user-images.githubusercontent.com/124915257/221995438-ffeacc2f-ee1b-4046-98e6-2877895eab99.PNG">
#### When we throw the ball, the movement will be a projectile motion, therefore, you can do your calculations according to the given formulas:

<img width="145" alt="projectile" src="https://user-images.githubusercontent.com/124915257/221995500-81aa2ed8-96ec-417c-ad1f-475cf44b0683.PNG">
