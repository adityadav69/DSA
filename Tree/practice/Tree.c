#include <stdio.h>
#include<stdlib.h>

struct node{
    struct node* left;
    struct node* right;
    int data;
};


struct node * createNode(int data){
    struct node *n;
    n=(struct node *)malloc(sizeof(struct node));
    n->left=NULL;
    n->right=NULL;
    n->data=data;
}

int main()
{

    /*
    struct node *p;
    p=(struct node *)malloc(sizeof(struct node));
    p->left=NULL;
    p->right=NULL;
    p->data=5;
    

    struct node *p1;
    p1=(struct node *)malloc(sizeof(struct node));
    p1->left=NULL;
    p->right=NULL;
    p->right=3;

    struct node *p2;
    p2=(struct node *)malloc(sizeof(struct node));
    p2->left=NULL;
    p2->right=NULL;
    p->data=8;

    p->left=p1;
    p->right=p2;

    */

    struct node *p=createNode(5);
    struct node *p1=createNode(8);
    struct node *p2=createNode(4);

    p->left=p1;
    p->right=p2;

    return 0;
}