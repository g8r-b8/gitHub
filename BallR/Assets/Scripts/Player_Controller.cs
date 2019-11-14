using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Player_Controller : MonoBehaviour{

    //declare rb reference
    private Rigidbody rb;

    //speed control var, more accessible than hard coding a mltiplier
    public float speed;
    //is now editable property, can now make changes to it in editor

    //1st frame
    void Start()
    {
        //initialize rb at start of game
        rb = GetComponent<Rigidbody>();
    }


    void FixedUpdate () { //physics code goes in fixed update

        //input functions
        float moveHorizontal = Input.GetAxis ("Horizontal");
        float moveVertical = Input.GetAxis("Vertical");


        //to use Vector 3 we need a basis/ xyz values
        Vector3 movement = new Vector3(moveHorizontal, 0.0f, moveVertical);
        //x is horizonal, y up, z forward n back


        //Rididbody functions, need to access rigid body component
        // to act upon it, create variabe to hold reference to rb
        rb.AddForce(movement*speed);

    }

}
