using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Camera_Controller : MonoBehaviour
{

    public GameObject player; // reference to player
    private Vector3 offset; //private cus will only be controlled in script

    // Start is called before the first frame update
    void Start()
    {
        offset = transform.position - player.transform.position;
    }

    // Update is called once per frame
    //late update runs after each ite has been 
    //proccessed and moved for each frame
    void LateUpdate()
    {
        transform.position = player.transform.position + offset;
    }
}
