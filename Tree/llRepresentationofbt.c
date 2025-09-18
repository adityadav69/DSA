#include<stdio.h>
#include<malloc.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

struct node * createNode(int data){
    struct node *p;
    p=(struct node *)malloc (sizeof(struct node));
    p->left=NULL;
    p->right=NULL;
    p->data=data;
    return p;
}


int main(){

    // struct node * p;
    // p=(struct node *)malloc (sizeof(struct node));
    // p->data=2;
    // p->left=NULL;
    // p->right=NULL;

    // struct node * p1;
    // p1=(struct node *)malloc (sizeof(struct node));
    // p1->data=1;
    // p1->left=NULL;
    // p1->right=NULL;

    // struct node * p2;
    // p2=(struct node *)malloc (sizeof(struct node));
    // p2->data=3;
    // p2->left=NULL;
    // p2->right=NULL;

    //Linking left and right node to root node

    struct node * p=createNode(4);
    struct node * p1=createNode(2);
    struct node * p2=createNode(6);

    p->left=p1;
    p->right=p2;
    
    return 0;
}